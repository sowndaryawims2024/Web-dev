let version = "1.0.0"; // Initial version



console.log("Initial Version: " + version);



// Function to increase version

function increaseVersion(currentVersion) {

    let parts = currentVersion.split(".");

    let major = parseInt(parts[0]);

    let minor = parseInt(parts[1]);

    let patch = parseInt(parts[2]);



    // Increase patch version

    patch++;



    // Check if patch version exceeds 9

    if (patch > 9) {

        patch = 0;

        minor++; // Increase minor version

    }



    // Check if minor version exceeds 9

    if (minor > 9) {

        minor = 0;

        major++; // Increase major version

    }



    return major + "." + minor + "." + patch;

}



// Increase version

version = increaseVersion(version);



console.log("After increasing version: " + version);
