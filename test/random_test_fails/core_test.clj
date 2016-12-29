(ns random-test-fails.core-test
  (:require [clojure.test :refer :all]
            [random-test-fails.core :refer :all]))

(deftest always-successful
  (testing "This always succeeds"
    (is (= 1 1))))


(deftest almost-always-successful
  (testing "This almost always succeeds"
    (is (> (rand-int 100) 5))))

(deftest usually-successful
  (testing "This usually succeeds"
    (is (> (rand-int 100) 15))))

(deftest rarely-successful
  (testing "This rarely succeeds"
    (is (> (rand-int 100) 45))))
