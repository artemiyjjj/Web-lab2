import {getFloatLength} from "../math/math.js";
import {changeElemBackground as changeState} from "../formActions/formActions.js";
import {Y_MAX_VALUE, Y_MIN_VALUE, R_MAX_VALUE, R_MIN_VALUE, COLOR__WRONG_RED} from "../const/values.js";
import {yInput, rInput} from "../const/elements.js";

export const validate = function (event, {xValue, yValue, rValue}) {
    if ((isNaN(yValue) || isNaN(rValue)) || (yValue < Y_MIN_VALUE || yValue > Y_MAX_VALUE) || (rValue < R_MIN_VALUE || rValue > R_MAX_VALUE) || (getFloatLength(yValue) > 8 || getFloatLength(rValue) > 8 || getFloatLength(xValue) > 8)) {
        if (isNaN(yValue) || yValue < Y_MIN_VALUE || yValue > Y_MAX_VALUE || getFloatLength(yValue) > 8) {
            changeState(yInput, COLOR__WRONG_RED);
            return false;
        }
        if (isNaN(rValue) || rValue < R_MIN_VALUE || rValue > R_MAX_VALUE || getFloatLength(rValue) > 8) {
            changeState(rInput, COLOR__WRONG_RED);
            return false;
        }
    } else if (((!isNaN(yValue)) && !isNaN(rValue)) && (yValue >= Y_MIN_VALUE && yValue <= Y_MAX_VALUE) && (rValue >= R_MIN_VALUE || rValue <= R_MAX_VALUE)) {
        return true;
    }
    else return false;
}