(def board ["x" 1 2 3 4 5 6 7 8])

(def winning-patterns [[0 1 2] [3 4 5] [6 7 8] [0 3 6] [1 4 7] [2 5 8] [0 4 8] [2 4 6]])

(if (= (nth board 0) "y") "yes" "no")

(def test-path ["x" 1 2])
(if (= (nth test-path 0) "x") println "x has the square!")

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