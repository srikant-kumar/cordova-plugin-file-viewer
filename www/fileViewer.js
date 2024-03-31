var exec = require("cordova/exec");

exports.openFile = function (url, success, error) {
  exec(success, error, "CordovaFileViewer", "openFile", [url]);
};
