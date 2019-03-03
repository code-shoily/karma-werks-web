(ns karma-werks-web.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [karma-werks-web.core-test]))

(doo-tests 'karma-werks-web.core-test)
