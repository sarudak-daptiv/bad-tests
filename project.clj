(defproject random-test-fails "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :plugins [[lein-teamcity "0.2.2"]]
  :main ^:skip-aot random-test-fails.core
  :target-path "target/%s"
  :monkeypatch-clojure-test false
  :profiles {:uberjar {:aot :all}})
