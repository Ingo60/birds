(defproject birds "0.1.0-SNAPSHOT"
  :description "Example Frege-calls-custom-Java-class application, with dependency on jline"
  :url "https://github.com/Ingo60/birds"
  :license {:name "BSD 2 clause"
            :url "https://github.com/Ingo60/birds/blob/master/LICENSE"}
  ; The following is more or less fixed
  ; You may adapt the frege compiler version
  :dependencies [;; [org.clojure/clojure "1.6.0"]
                 ;; need to depend on Frege for runtime:
                 [com.theoryinpractise.frege/frege "3.22.324-g630677b"]
				 [jline/jline "1.0"]]
  :plugins [[lein-fregec "3.22.324"]]
  ; Good: The java source can be in the same directory as the frege stuff!
  :java-source-paths ["src"]
  :frege-source-paths ["src"]
  :target-path "bin"
  :main birds.Main
  :profiles {:uberjar {:aot :all
                       :prep-tasks ["javac" "fregec"]}})
