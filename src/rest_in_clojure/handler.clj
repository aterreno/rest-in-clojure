(ns rest-in-clojure.handler
  (:use compojure.core)
  (:use ring.middleware.json-params)
  (:use [cheshire.core :as json])
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defn json-response [data & [status]]
  {:status (or status 200)
   :headers {"Content-Type" "application/json"}
   :body (json/generate-string data)})

(defroutes app-routes
  (GET "/" []
    (json-response {"hello" "world"}))

  (PUT "/" [name]
    (json-response {"hello" name})))

(def app
  (handler/site app-routes))


