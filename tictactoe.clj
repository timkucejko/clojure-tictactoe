(def board ["x" 1 2 3 "x" 5 6 7 "x"])
(println (subvec board 0 3))
(println (subvec board 3 6))
(println (subvec board 6 9))

(def winning-patterns [[0 1 2] [3 4 5] [6 7 8] [0 3 6] [1 4 7] [2 5 8] [0 4 8] [2 4 6]])


(defn is-winner [pos1 pos2 pos3]
	(println pos1 " " pos2 " " pos3)
	(if (= (get board pos1) (get board pos2) (get board pos3) "x")
		(println "x wins the match!")
		(if (= (get board pos1) (get board pos2) (get board pos3) "y") 
			(println "y wins the match!")
			()
		)
	)
)

(for [win-path winning-patterns] (apply is-winner win-path))

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