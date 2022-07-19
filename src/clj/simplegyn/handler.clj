(ns simplegyn.handler
  (:require [ring.util.response :as resp]
            [simplegyn.pages :as pages]))


(defn handle-index [req]
  (resp/response (pages/index)))


(defn handle-posts [req]
  (resp/response (pages/posts)))
