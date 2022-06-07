(ns simplegyn.components)


(defn logo []
  [:div {:class "w-60 w-30-ns center"}
   [:img {:src "img/logo.svg"}]])


(defn nav-button [text & [opts]]
  [:a (merge
       {:class "f5 f4-ns link bg-animate black-80 hover-bg-light-pink dib pa3 ph4-l"
        :href "#"
        :title text}
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
  [:section
   {:class "mw6 center avenir black-80"}
   #_[:h2 {:class "baskerville fw1 ph3 ph0-l"}
      "Posts"]
   [:article {:class "bb b--black-10"}
    [:a {:class "db pv4 ph3 ph0-l no-underline black dim"
         :href "#"}
     [:div {:class "w-100"}
      [:h1 {:class "f3 fw1 baskerville mt0 lh-title"}
       "Dankbarkeitjournal"]
      [:p {:class "f6 f5-l lh-copy"}
       "Neuroplastizität (die Fähigkeit des Gehirns, sich als Reaktion
       auf das Denken zu verändern) kann sowohl für uns als auch gegen
       uns arbeiten, denn das, worüber wir am meisten nachdenken, wird
       wachsen – das gilt sowohl für das Positive als auch für das
       Negative."]
      [:p {:class "f6 lh-copy mv0"}
       "By Mariana Munteanu"]]]]

   
   [:article {:class "b--black-10"}
    [:a {:class "db pv4 ph3 ph0-l no-underline black dim"
         :href "#"}
     [:div {:class "w-100"}
      [:h1 {:class "f3 fw1 baskerville mt0 lh-title"}
       "Allgemeine Schritte"]
      [:p {:class "f6 f5-l lh-copy"}
       "Diät: Keto-diät.Diät nach Budwig Eigene Gesundheit in eigenen
       Händen nehmen!"]
      [:p {:class "f6 lh-copy mv0"}
       "By Mariana Munteanu"]]]]])


(defn index []
  [:<>
   [:header {:class "pv2 tc serif"}
    [logo]
    [nav]]
   [posts]
   [footer]])
