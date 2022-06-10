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



(defn get-posts []
  [{:title "Dankbarkeitjournal"
    :author "Mariana Munteanu"
    :summary "Neuroplastizität (die Fähigkeit des Gehirns, sich als
       Reaktion auf das Denken zu verändern) kann sowohl für uns als
       auch gegen uns arbeiten, denn das, worüber wir am meisten
       nachdenken, wird wachsen – das gilt sowohl für das Positive als
       auch für das Negative."}

   {:title "Allgemeine Schritte"
    :author "Mariana Munteanu"
    :summary "Diät: Keto-diät.Diät nach Budwig Eigene Gesundheit in
       eigenen Händen nehmen!"}])



(defn post-summary [post]
  [:article
   [:a {:class "db pv4 ph3 ph0-l no-underline black dim"
        :href "#"}
    [:div {:class "w-100"}
     [:h1 {:class "f3 fw1 baskerville mt0 lh-title"}
      (:title post)]
     [:p {:class "f6 f5-l lh-copy"}
      (:summary post)]
     [:p {:class "f6 lh-copy mv0"}
      (str "By " (:author post))]]]])



(defn section-posts-summary [posts]
  [:section
   {:class "mw6 center avenir black-80"}
   #_[:h2 {:class "baskerville fw1 ph3 ph0-l"}
      "Posts"]
   (->> posts
        (map post-summary posts)
        (interpose [:div {:class "bb b--black-10"}] ))])



(defn quote [text author]
  [:div {:class "pv3"}
   [:blockquote {:class "athelas ml0 mt0 pl4 black-90 bl bw2 b--light-pink"}
    [:p {:class "f4 lh-copy measure mt0"}
     (str "„" text "“")]
    [:cite {:class "f6 ttu tracked fs-normal"}
     (str "― " author)]]])



(defn section-post [post]
  [:section {:class "mw6 center avenir ph3 ph0-l black-80"}

   [:header {:class "mb3"}
    [:h1 {:class "mt4 mb3 lh-title"}
     (:title post)]
    [:time {:class "f6 ttu tracked gray"}
     (:author post)]]
   
   [:div
    [quote
     "Lasst den Geist eures Denkens erneuern und zieht euer neues Ich an."
     "Epheser 4:23"]
    
    [:p {:class "lh-copy measure mt0"}
     "Neuroplastizität (die Fähigkeit des Gehirns, sich als Reaktion
     auf das Denken zu verändern) kann sowohl für uns als auch gegen
     uns arbeiten, denn das, worüber wir am meisten nachdenken, wird
     wachsen – das gilt sowohl für das Positive als auch für das
     Negative."]]])




(defn index []
  [:<>
   [:header {:class "pv2 tc serif"}
    [logo]
    [nav]]
   #_[section-posts-summary (get-posts)]
   [section-post (first (get-posts))]
   [footer]])
