(ns simplegyn.components)


(defn index []
  [:header {:class "bg-white pv2 tc"}
   [:div {:class "w-30-ns w-70 tc center"}
    [:img {:src "img/logo.svg"}]]
   
   [:nav {:class "bt bb tc mw6 center mt2"}
    [:a {:class "f3 f6-ns f5-l link bg-animate black-80 hover-bg-light-pink dib pa3 ph4-l"
         :href "#"}
     "Home"]
    [:a {:class "f3 f6-ns f5-l link bg-animate black-80 hover-bg-light-pink dib pa3 ph4-l"
         :href "#"}
     "Posts"]
    [:a {:class "f3 f6-ns f5-l link bg-animate black-80 hover-bg-light-pink dib pa3 ph4-l"
         :href "#"}
     "About"]]])
