## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies
- `Archive`: the folder containing archived source files, including the `DrawingPanel` class.

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Managing `DrawingPanel` Source

The `DrawingPanel` class, used for graphical operations, is archived in the `Archive/graphics` directory. The compiled class is included in a JAR file located in the `lib` directory. If you need to modify the `DrawingPanel` class:

1. Navigate to `Archive/graphics`.
2. Make the necessary changes to `DrawingPanel.java`.
3. Recompile the class: `javac DrawingPanel.java`.
4. Update the JAR file in `lib`: `jar cvf ../lib/DrawingPanel.jar graphics/`.
5. Ensure the updated JAR file is referenced in your project settings.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).