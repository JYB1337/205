--John Youngblood
module FortyEight where
solve :: Integer
solve = mod (sum [brute x | x <- [1..1000]]) 10000000000

brute :: Integer -> Integer
brute x = mod (x^x) 10000000000

test :: Integer
test = mod (sum [x^x | x <- [1..1000]]) 10000000000

main :: IO()
main = print test
