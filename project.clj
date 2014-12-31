(defproject cryogen "0.1.0"
            :description "Simple static site generator"
            :url "https://github.com/lacarmen/cryogen"
            :license {:name "Eclipse Public License"
                      :url "http://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [[org.clojure/clojure "1.6.0"]
                           [markdown-clj "0.9.61"
                            :exclusions [com.keminglabs/cljx]]
                           [ring/ring-devel "1.3.2"]
                           [compojure "1.3.1"]
                           [ring-server "0.3.1"]
                           [selmer "0.7.7"]
                           [clj-text-decoration "0.0.3"]
                           [io.aviso/pretty "0.1.13"]
                           [cryogen-core "0.1.9"]]
            :plugins [[lein-ring "0.8.13"]]
            :main cryogen.compiler
            :ring {:init cryogen.server/init
                   :handler cryogen.server/handler})
