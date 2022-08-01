(ns simplegyn.pages
  (:require [simplegyn.components :as sc]
            [hiccup.page :as hp]
            [clojure.pprint :refer [pprint]]))


(defn index [{:as req}]
  (hp/html5
   sc/header
   [:body
    [:header {:class "pv2 tc serif"}
     (sc/logo)
     (sc/nav)]
    
    (sc/section-posts-summary sc/posts)
    
    (sc/footer)]))



(def posts-db
  (reduce #(assoc %1 (:slug %2) %2) {} sc/posts))


(defn posts [{{slug :slug} :path-params :as req}]
  (hp/html5
   sc/header
   [:body
    [:header {:class "pv2 tc serif"}
     (sc/logo)
     (sc/nav)]

    (:post (get posts-db slug))
    
    (sc/footer)]))
