(defproject es.topiq/rincanter
  "1.0.0-SNAPSHOT"
  :description "Clojure/R integration using rosuda JRIEngine"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [org.clojure/core.incubator "0.1.3"]
                 ;; Until this bug is fixed in incanter:
                 ;; https://github.com/liebke/incanter/issues/84
                 [incanter "1.5.5" :exclusions [incanter/incanter-mongodb]]

                 [REngine/REngine "0.5-5"]
                 [JRIEngine/JRIEngine "0.5-5"]]
  :autodoc {:name "rincanter"
            :description "Clojure/R integration using rosuda JRIEngine"
            :page-title "Rincanter API documentation"
            :copyright "Eclipse Public License (EPL)"
            :web-src-dir "http://github.com/jolby/rincanter/blob/"
            :web-home "http://jolby.github.com/rincanter/"})
