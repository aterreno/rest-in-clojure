(ns rest-in-clojure.handler
  (:use compojure.core)
  (:use ring.middleware.json-params)
  (:use [cheshire.core :as json])
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
