(ns karma-werks-web.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [karma-werks-web.core :as core]))

(deftest fake-test
  (testing "fake description"
    (is (= 1 2))))
