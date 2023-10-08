# Deobfuscator for Method Invocations

This Java program is designed to deobfuscate method invocations within a Java source code file. It replaces obfuscated method calls with their original strings. The deobfuscation process involves parsing method calls in the format `Deobfuscator$app$Release.getString(...)`, extracting the argument values, and reconstructing the original string.

## Usage Instructions

### 1. Clone or Download the Repository

Clone this repository to your local machine or download it as a ZIP file and extract the contents.

### 2. Replace Chunks in `DeObf` Class

Before running the Deobfuscator, you need to replace the `chunks` array in the `DeObf` class with the chunks obtained from the APK file you want to deobfuscate. Chunks are crucial for the deobfuscation process.

#### How to Obtain Chunks

1. **Install JADX GUI**:
   - Download JADX GUI from the official repository: [JADX GUI](https://github.com/skylot/jadx).
   - Follow the installation instructions for your platform.

2. **Decompile the APK**:
   - Open JADX GUI and use it to open the APK file you want to deobfuscate.
   - Explore the decompiled code in JADX GUI to identify the obfuscated strings you want to deobfuscate.

3. **Extract Chunks**:
   - Use JADX GUI's interface to copy the obfuscated chunks or strings you want to deobfuscate.
   - Ensure you format the chunks as an array of strings (e.g., `{"chunk1", "chunk2", ...}`).

### 3. Configure the Input and Output Paths

In the `Deobfuscator` class:
- Set the `inputFilePath` variable to the path of the input Java file with obfuscated method calls.
- Set the `outputFilePath` variable to the desired path for the output Java file with deobfuscated method calls.

### 4. Run the Deobfuscator

Run the Deobfuscator by executing the `main` method in the `Deobfuscator` class. This will read the input file, perform the deobfuscation, and write the modified code to the output file.

### 5. Review the Deobfuscated Code

The deobfuscated code will be saved to the specified output file (e.g., `output.java`). You can review and analyze the deobfuscated code as needed.

## Important Notes

- Ensure you have Java installed on your system to run this code.
- Backup your original APK file before attempting to deobfuscate it.
- This Deobfuscator is a valuable tool for reverse engineering and understanding obfuscated Java code.

If you encounter any issues or have questions, please feel free to [open an issue](https://github.com/KMKINGMAN/paranoid-deobfuscator-selfScript/issues) in this GitHub repository.

Happy deobfuscating!
