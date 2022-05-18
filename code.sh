#!/bin/bash
#
# I use this script to format all the files in this repo.
#
########################################################################################

## Requires bash 4.4+
mapfile -t java_list < <(find . -name "*.java")
mapfile -t c_list < <(find . -name "*.c")

for i in "${java_list[@]}"; do
    clang-format --verbose -style=file:"/Users/hunter/Programs/Mine/Formatter Configs/Java_clang-format/_clang-format" -i "$i"
done

for i in "${c_list[@]}"; do
    clang-format --verbose -style=file:"/Users/hunter/Programs/Mine/Formatter Configs/C-Cpp_clang-format/_clang-format" -i "$i"
done

