(ns simplegyn.components)


(defn logo []
  [:div {:class "w-60 w-30-ns center"}
   [:img {:src "img/logo.svg"}]])


(defn nav-button [text & [opts]]
  [:a (merge
       {:class "f5 f4-ns link bg-animate black-80 hover-bg-light-pink dib pa3 ph4-l"
        :href "#"}
       opts)
   text])


(defn nav []
  [:nav {:class "bt bb tc mw6 center mt2"}
   [nav-button "Home"]
   [nav-button "Posts"]
   [nav-button "About"]])



(defn footer []
  [:footer {:class "pv4 ph3 ph5-m ph6-l mid-gray"}
   [:small {:class "f6 db tc"}
    "© 2022 "
    [:b {:class "ttu"} "SimpleGyn"]
    "., All Rights Reserved"]
   [:div {:class "tc mt3"}
    [:a {:class "f6 dib ph2 link mid-gray dim"
         :href "/language" :title "Language"}
     "Language"]
    [:a {:class "f6 dib ph2 link mid-gray dim"
         :href "/terms" :title "Terms"}
     "Terms of Use"]
    [:a {:class "f6 dib ph2 link mid-gray dim"
         :href "/privacy" :title "Privacy"}
     "Privacy"]]])


(defn posts []
  [:div])


(defn index []
  [:<>
   [:header {:class "pv2 tc serif"}
    [logo]
    [nav]]
   [posts]
   [footer]])
