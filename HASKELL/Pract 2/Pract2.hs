module Pract2 where
--Ej1
divisors:: Int ->[Int]
divisors x = [y | y <-[1..x],mod x y == 0 ]

--Ej2
member:: Int -> [Int] -> Bool
member x [] = False
member x (y:ys) = if x == y then True
                    else member x ys

--Ej3
isPrime:: Int -> Bool
isPrime x = if length (divisors x) == 2||
            (member 1 (divisors x) && length (divisors x) == 1) then True
              else False

--Ej4
primes:: Int -> [Int]
primes x = take x [x | x <-[1..],isPrime x]

--Ej5
selectEven:: [Int] -> [Int]
selectEven xs = [y | y <- xs,even y]

--Ej6
selectEvenPos::[Int] ->[Int]
selectEvenPos xs = [xs !! i | i<-[0.. length xs-1],even i]

--Ej7
ins:: Int -> [Int] -> [Int]
ins x [] = [x]
ins x (y:ys)
            | x < y = (x:y:ys)
            | x > y = y: (ins x ys)

iSort :: [Int] -> [Int]
iSort (ys:[]) = [ys]
iSort (x:y:ys)
              | x < y =  x : iSort(ins y ys)
              | x > y = y: iSort(ins x ys)

--Ej8
doubleAll:: [Int] -> [Int]
doubleAll ys = map (2*) ys

--Ej9
mapi:: (a -> b) -> [a] -> [b]
mapi f ys = [f z | z <-ys]

--Ej10
filteri:: (a -> Bool) -> [a] -> [a]
filteri f ys = [z | z <- ys, f z == True]

--Ej11
type Person = String
type Book = String
type Database = [(Person,Book)]
borrow :: Database -> Book -> Person -> Database
borrow dbase b p = [ (person,book) | (person,book) <- dbase, p /= person, b /= book ]

returni:: Database -> (Person,Book) ->Database
returni dbase (p,b) = (p,b):dbase

--Ej12
data Tree a = Leaf a | Branch (Tree a) (Tree a) deriving show
symetric:: Tree a -> Tree a
symetric (Leaf l)= Leaf l
symetric (Branch a b) = Branch (symetric b) (symetric a)

--Ej13

listToTree:: [a] -> Tree a
listToTree (x:[]) = Leaf x
listToTree (x:xs) = Branch (Leaf x) (listToTree xs)

treeToList:: Tree a -> [a]
treeToList (Leaf x) = [x] 
treeToList (Branch a b) = treeToList a treeToList b


treeToList
