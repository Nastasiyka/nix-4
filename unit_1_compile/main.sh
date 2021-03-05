#!/bin/sh

cd terminal_compile
. ./terminal.sh

# Рассчитано на то, что переменная ANT_HOME уже есть
cd ../ant_compile
. ./ant.sh

cd ../maven_compile/maven_app
. ./maven.sh
