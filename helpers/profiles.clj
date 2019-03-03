{:user {:plugin-repositories [["private-plugins" {:url "private repo url"}]]
        :dependencies [[pjstadig/humane-test-output "0.9.0"]
                       [com.bhauman/rebel-readline "0.1.4"]]
        :injections [(require 'pjstadig.humane-test-output)
                     (pjstadig.humane-test-output/activate!)]
        :plugins [[cider/cider-nrepl "0.21.1"]
                  [refactor-nrepl "2.4.0"]
                  [com.jakemccrary/lein-test-refresh "0.23.0"]
                  [lein-autoexpect "1.9.0"]
                  [lein-ancient "0.6.15"]
                  [jonase/eastwood "0.3.5"]
                  [lein-kibit "0.1.6"]
                  [lein-pprint "1.2.0"]]
        :test-refresh {:notify-command ["terminal-notifier" "-title" "Tests" "-message"]}}}
