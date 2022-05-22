(ns simplegyn.components)


(defn logo []
  [:div {:class "w-60 w-30-ns center"}
   [:img {:src "img/logo.svg"}]])


(defn button [text & [opts]]
  [:a (merge
       {:class "f4 f5-ns link bg-animate black-80 hover-bg-light-pink dib pa3 ph4-l"
        :href "#"}
       opts)
   text])


(defn nav []
  [:nav {:class "bt bb tc mw6 center mt2"}
   [button "Home"]
   [button "Posts"]
   [button "About"]])


(defn index []
  [:header {:class "bg-white pv2 tc"}
   [logo]
   [nav]])
