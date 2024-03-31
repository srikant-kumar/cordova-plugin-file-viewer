# Cordova Plugin File Viewer

CordovaFileViewer plugin enables effortless viewing of PDF and image files in Cordova apps on Android. It seamlessly opens files from URLs using default viewer apps, enhancing user experience.

## Description

Cordova Plugin File Viewer is a versatile tool designed to seamlessly integrate file viewing functionality into Cordova applications, specifically tailored for Android platforms. With this plugin, developers can empower their apps to effortlessly display PDF and image files sourced from URLs, leveraging the default viewer apps available on users' devices. This streamlined approach significantly enhances the user experience, allowing for quick and intuitive access to external files without the need for manual downloads or complicated configurations.

### Key Features:

Effortless File Viewing: Cordova Plugin File Viewer simplifies the process of opening PDF and image files within Cordova applications, eliminating the need for cumbersome manual handling.

1. **Seamless Integration:** The plugin seamlessly integrates with Cordova projects, ensuring smooth operation and compatibility with existing development environments.

2. **Automatic Detection:** It automatically detects the file type based on the provided URL, allowing for dynamic handling of PDF and image files without requiring explicit configuration.

3. **Default Viewer Apps:** Leveraging the default viewer apps available on Android devices, the plugin ensures a consistent and familiar viewing experience for users.

4. **Enhanced User Experience:** By enabling users to view files directly from URLs, the plugin enhances the overall user experience, reducing friction and improving app usability.

5. **Simple API:** With a straightforward API interface, developers can easily incorporate file viewing functionality into their Cordova applications with minimal effort.

## Installation using GIT

```bash
cordova plugin add https://github.com/srikant-kumar/cordova-plugin-file-viewer.git
```

## Installation using CORDOVA

```bash
cordova plugin add @srikant-kumar/cordova-plugin-file-viewer
```

## Usage

```code
cordova.plugins.fileViewer.openFile(
  file_url,
  successCallback,
  errorCallback
);

function successCallback(response) {
  console.log("File opened successfully:", response);
}

function errorCallback(error) {
  console.error("Error opening file:", error);
}

```

## Author

Developed by **Srikant Kumar**, this plugin aims to streamline file viewing functionality within Cordova applications, enhancing usability and user satisfaction.
