public class Versioning {

    private static String version = "1.0.0"; // Initial version



    public static void main(String[] args) {

        // Print initial version

        System.out.println("Initial Version: " + version);



        // Increase version

        version = increaseVersion(version);

        System.out.println("After increasing version: " + version);

    }



    // Method to increase version

    private static String increaseVersion(String currentVersion) {

        String[] parts = currentVersion.split("\\.");

        int major = Integer.parseInt(parts[0]);

        int minor = Integer.parseInt(parts[1]);

        int patch = Integer.parseInt(parts[2]);



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

}
