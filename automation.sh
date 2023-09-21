#!/bin/bash
git add .
read -p "enter the commit message: " message
git commit -m "$message"
git push
