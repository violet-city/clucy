(defproject city.violet/clucy "0.0.0"
  :description "[FORK] A Clojure interface to the Lucene search engine"
  :url "http://github/city-violet/clucy"
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.apache.lucene/lucene-core "4.2.0"]
                 [org.apache.lucene/lucene-queryparser "4.2.0"]
                 [org.apache.lucene/lucene-analyzers-common "4.2.0"]
                 [org.apache.lucene/lucene-highlighter "4.2.0"]]
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.0"]]}}
  :codox {:src-dir-uri               "http://github/city-violet/clucy/blob/master"
          :src-linenum-anchor-prefix "L"})
