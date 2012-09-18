(ns rest-in-clojure.test.handler
  (:use clojure.test
        ring.mock.request
        rest-in-clojure.handler
        cheshire.core))

(deftest test-app
  (testing "GET /"
    (let [response (app (request :get "/"))]
      (is (= (:status response) 200))
      (is (= (:body response) (generate-string {:hello "world"})))))
    (testing "PUT /"
      (let [response (app (request :put "/" {"name" "world"}))]
        (is (= (:status response) 200))
        (is (= (:body response) (generate-string {:hello "world"}))))))





