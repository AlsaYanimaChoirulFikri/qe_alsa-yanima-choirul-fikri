#!/bin/sh

if [ ! -d "about_me" ]; then
    mkdir about_me
fi

if [ ! -d "favorites" ]; then
    mkdir favorites
fi

echo "Alsa Yanima Choirul Fikri dari Universitas Gadjah Mada" > about_me/about_me.txt


echo "Nasi dan Mie" > favorites/food.txt

echo "Air Putih dan Kopi" > favorites/drinks.txt
