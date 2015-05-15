(def board ["x" 1 2 3 "x" 5 6 7 "x"])

(def winning-patterns [[0 1 2] [3 4 5] [6 7 8] [0 3 6] [1 4 7] [2 5 8] [0 4 8] [2 4 6]])

(if (= (nth board 0) "y") "yes" "no")

(def test-path ["x" 1 2])
(if (= (nth board 0) (nth board 4) (nth board 8) "x") (println "x wins the match!") (println "no winner yet"))

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