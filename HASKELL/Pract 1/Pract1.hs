module Pract1 where
import Data.Char
-- Ej1
numCbetw2:: Char->Char->Int
numCbetw2 a b = ord b - ord a

--Ej2

sumatorio::  Int -> Int -> Int
sumatorio x y
              | x < y = x + sumatorio (x+1) y
              | x == y = y

--Ej3
maxi:: Int -> Int -> Int
maxi x y = if x > y then x
            else y

--Ej4
leapyear:: Int -> Bool
leapyear x
          |mod x 4 == 0 && mod x 100 /= 0 = True
          |mod x 400 == 0 = True
          |otherwise = False
--Ej5
daysAmonth:: Int -> Int -> Int
daysAmonth x y
          | x == 2 = if (leapyear y) then 29 else 28
          | x == 1 || x == 3 || x == 5 || x == 7 || x == 8|| x == 10 || x == 12 = 31
          | x == 2 || x == 4 || x == 6 || x == 9 || x == 11 = 30

--Ej6


--Ej 7

fact:: Int -> Int
fact 1 = 1
fact 0 = 1
fact x = x * fact x-1

sumFacts:: Int -> Int
sumFacts 1 = 1
sumFacts x = fact x + sumFacts x-1
