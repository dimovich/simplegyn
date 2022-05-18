(ns ^:figwheel-hooks simplegyn.core
  (:require [reagent.dom :as rd]))


(defn app []
  [:div "Hello World!"])


(defn ^:after-load reload []
  (rd/render [app] (.getElementById js/document "app")))


(defn main []
  (reload))
