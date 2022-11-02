const HtmlWebpackPlugin = require("html-webpack-plugin");
const path = require("path");

module.exports = {
    entry: "./js-applications/index.js",
    module: {
        rules: [
            { test: /\.css$/, use: ["style-loader", "css-loader"] }
        ]
    },
    output: {
        path: path.resolve(__dirname, "../src/main/webapp/"),
        filename: "bundle.js"
    },
    plugins: [
        new HtmlWebpackPlugin({
            inject: true,
            template: './index.html'
        })
    ]
}