module Coinjam where

type Coin = [Integer]

coinsize = 32

starter_coin = 2^(coinsize-1) + 1

coin_list = [ starter_coin+(2*j) | j <- [1..] ]

mk_coin:: Integer -> Coin
mk_coin 0 = []
mk_coin i = (mk_coin (div i 2)) ++ [(rem i 2)] 

non_triv_div:: Integer -> Integer
non_triv_div i = non_triv_div_aux i 3
	where
		non_triv_div_aux i j = if (j == i) || (j > 150) then -1 else (if (rem i j) == 0 then j else non_triv_div_aux i (j+2))
		
type Answer = (Bool, Integer, [Integer])

mk_div::Coin -> [Integer]
mk_div coin = mk_div_aux coin 2
	where
		mk_div_aux coin 11 = []
		mk_div_aux coin base = [(non_triv_div (convert_base coin base))] ++ (mk_div_aux coin (base+1))

convert_base::Coin -> Integer -> Integer
convert_base coin base = convert_base_aux coin base (coinsize-1)
	where
		convert_base_aux [] base exp = 0
		convert_base_aux (c:t) base exp = (c * ( base ^ exp )) + (convert_base_aux t base (exp-1) )
		
mk_answer::Coin -> Answer
mk_answer coin = if (elem (-1) div) then (False, (convert_base coin 10), div) else (True, (convert_base coin 10), div)
	where
		div = mk_div coin

val_answer::Answer -> Bool
val_answer (b, c, d) = b
		
jamcoin_list::[Answer]
jamcoin_list = [ mk_answer (mk_coin x) | x <- coin_list ]

test_coin = \h -> mk_answer (mk_coin h)

filtered_list = filter val_answer jamcoin_list
