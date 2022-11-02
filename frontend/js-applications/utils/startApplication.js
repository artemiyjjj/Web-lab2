import * as consts from "./const/elements.js";
import {CONTROLLER} from "./const/routes.js";
import {request} from "./request/request.js";
import {validate} from "./validation/validator.js";
import {changeElemBackground} from "./formActions/formActions.js";

export const startApplication = function () {
    consts.form.addEventListener("submit", function (event) {
        event.preventDefault();
        let xValue = consts.xInput.value;
        let yValue = consts.yInput.value;
        let rValue = consts.rInput.value;

        yValue = yValue.replace(",", ".");
        rValue = rValue.replace(",", ".");

        xValue = parseFloat(xValue);
        yValue = parseFloat(yValue);
        rValue = parseFloat(rValue);


        const coordinates = {xValue, yValue, rValue};

        if (validate(event, coordinates)) {
            request(CONTROLLER, coordinates)
                .then(response => {
                        if (response.ok) {
                            return response.text();
                        }
                        else if (response.status === 404) {
                            alert("???") //TODO ну и че это
                        }
                        else {
                            alert(response.status);
                        }
                    },
                    err => {
                        console.log(err);
                    })
                .then(data => data ? consts.tbody.insertAdjacentHTML("beforeend", data) : false);
        }
    });

    consts.form.addEventListener("input", function(event) {
        if (event.target.tagName != "label") {
            changeElemBackground(event.target, "white")
        }
    })
}