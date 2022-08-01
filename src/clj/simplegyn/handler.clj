(ns simplegyn.handler
  (:require [ring.util.response :as resp]
            [simplegyn.pages :as pages]))


(defn handle-index [req]
  (resp/response (pages/index req)))


(defn handle-posts [req]
  (assoc (resp/response (pages/posts req))
         :content-type "text/html"))
