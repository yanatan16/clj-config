(defproject org.clojars.yanatan16/config "0.1.0"
  :description "Read configs from json files and environment variables"
  :url "https://github.com/yanatan16/clj-config"
  :license {:name "MIT"
            :url "https://github.com/yanatan16/clj-config/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [org.clojure/data.json "0.2.5"]
                 [environ "1.0.0"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.7"]]
                   :plugins [[lein-environ "1.0.0"]]
                   :resource-paths ["test-resources"]
                   :env {:test-var "test-val"}}})
