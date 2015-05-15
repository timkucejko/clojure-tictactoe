(def board ["x" "y" "x" 3 4 5 6 7 8])

(def winning-patterns [[0 1 2] [3 4 5] [6 7 8] [0 3 6] [1 4 7] [2 5 8] [0 4 8] [2 4 6]])

(if (= (nth board 0) "y") "yes" "no")

(def test-path ["x" 1 2])
(if (= (nth board 0) (nth board 1) (nth board 2) "x") println "x wins the match!")

;;(for [win-path winning-patterns] (if (= nth board (nth win-path 0))))

(comment
ways to win:
0 1 2
3 4 5
6 7 8
0 3 6
1 4 7
2 5 8
0 4 8
2 4 6
	)