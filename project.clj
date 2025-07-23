(defproject com.github.discljord/discljord "1.3.1"
  :description " A Clojure wrapper library for the Discord API, with full API coverage (except voice, for now), and high scalability."
  :url "https://github.com/IGJoshua/discljord"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.12.1"]
                 [org.clojure/core.async "1.8.741"]
                 [org.clojure/data.json "2.5.1"]
                 [org.clojure/tools.logging "1.3.0"]
                 [http-kit/http-kit "2.8.0"]
                 [stylefruits/gniazdo "1.2.2"]]
  :target-path "target/%s"
  :jar-name "discljord-%s.jar"
  :deploy-branches ["master" "release" "hotfix"]
  :profiles {:dev {:dependencies [[http-kit.fake/http-kit.fake "0.2.2"]
                                  [ch.qos.logback/logback-classic "1.5.18"]]
                   :plugins [[lein-codox "0.10.8"]]
                   :exclusions [http-kit]
                   :jvm-opts ["--add-opens" "java.base/java.lang=ALL-UNNAMED" "-Dclojure.tools.logging.factory=clojure.tools.logging.impl/slf4j-factory"]}})
