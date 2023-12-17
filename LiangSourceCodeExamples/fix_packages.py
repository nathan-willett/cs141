import os
import glob

def replace_package_declaration(directory, old_package_base, new_package_base, chapters):
    for chapter in chapters:
        old_package = old_package_base + str(chapter)
        new_package = new_package_base + str(chapter)
        for filename in glob.iglob(directory + '**/*.java', recursive=True):
            with open(filename, 'r') as file:
                filedata = file.read()

            # Check if this file is part of the current chapter
            if ('package ' + old_package + ';') in filedata:
                # Replace the target string
                filedata = filedata.replace('package ' + old_package + ';', 'package ' + new_package + ';')

                # Write the file out again
                with open(filename, 'w') as file:
                    file.write(filedata)

# List of chapters to process
chapters = range(10, 37)  # Replace with your actual chapters

replace_package_declaration('C:\\GitHub\\cs141\\LiangSourceCodeExamples\\', 'chapter', 'LiangSourceCodeExamples.chapter', chapters)