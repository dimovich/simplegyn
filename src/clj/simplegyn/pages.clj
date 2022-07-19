(ns simplegyn.pages
  (:require [simplegyn.components :as sc]
            [hiccup.page :as hp]))


(defn index [& opts]
  (hp/html5
   sc/header
   [:body
    [:header {:class "pv2 tc serif"}
     (sc/logo)
     (sc/nav)]
    
    (sc/section-posts-summary sc/posts)
    
    (sc/footer)]))



(defn posts [& opts])
