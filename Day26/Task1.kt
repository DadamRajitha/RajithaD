/*Step 1: Install Kotlin
Install IntelliJ IDEA: If you haven't already installed IntelliJ IDEA, download it from JetBrains website and install it on your system.

Open IntelliJ IDEA.

Configure Kotlin Plugin:

Go to File -> Settings (on Windows) or IntelliJ IDEA -> Preferences (on macOS).
In the settings dialog, select Plugins.
Click on Marketplace tab.
Search for "Kotlin" and install the Kotlin plugin by JetBrains.
Restart IntelliJ IDEA to apply the changes.

Step 2: Create a New Kotlin Project
Create New Project:

Open IntelliJ IDEA.
Click on Create New Project or File -> New -> Project.
Choose Kotlin from the list on the left.
Select Kotlin/JVM.
Configure Project:

Set the Project name (e.g., HelloKotlin).
Choose the Project location where you want to save it.
Click Finish.
Step 3: Write and Run "Hello, World!" Program
Create Kotlin File:

In the Project tool window (usually on the left side), right-click on src directory.
Select New -> Kotlin File/Class.
Enter a name for your Kotlin file (e.g., Main).
Write Kotlin Code:

Inside Main.kt, write the following Kotlin code for a "Hello, World!" program:
kotlin
Copy code
fun main() {
    println("Hello, World!")
}
Run the Program:

Right-click anywhere inside the main() function.
Select Run 'MainKt'.
Verify Output:

Check the Run tool window (usually at the bottom of IntelliJ IDEA) for the output "Hello, World!".
Verification
If you see "Hello, World!" printed in the Run tool window, then your Kotlin and IntelliJ IDEA setup is working correctly.

Additional Notes
Make sure you have Java Development Kit (JDK) installed and configured in IntelliJ IDEA before starting, as Kotlin runs on the JVM.
Always keep IntelliJ IDEA and Kotlin plugin up to date to leverage the latest features and bug fixes.
Following these steps should help you successfully install Kotlin, configure IntelliJ IDEA, and run a "Hello, World!" program.*/


fun main() {
    println("hello,world")
}
