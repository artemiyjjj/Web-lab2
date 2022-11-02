import axios from "axios";
export function request(targetURL, {xValue, yValue, rValue}) {
    console.log("x:" + xValue + " y: " + yValue + " r: " + rValue);
    return axios.post(targetURL,{
        x:xValue,
        y:yValue,
        r:rValue})
}