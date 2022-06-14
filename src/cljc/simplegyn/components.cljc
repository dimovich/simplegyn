(ns simplegyn.components)


(defn merge-opts [m1 m2]
  (merge-with #(str %1 " " %2) m1 m2))


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
   [:blockquote {:class "athelas ml0 mv0 pl4 black-90 bl bw2 b--light-pink"}
    [:p {:class "f4 lh-copy measure mt0"}
     (str "„" text "“")]
    [:cite {:class "f6 ttu tracked fs-normal"}
     (str "― " author)]]])


(defn quote2 [text]
  [:blockquote {:class "athelas ph0 pv2 mh0 tc b i measure"}
   [:p {:class "f4 lh-copy"}
    text]])


(defn paragraph
  ([text] [paragraph {} text])
  ([opts text]
   [:p (-> {:class "lh-copy measure"}
           (merge-opts opts))
    text]))


(defn article-title [title author]
  [:header {:class "mb3"}
   [:h1 {:class "mt4 mb3 lh-title"}
    title]
   [:time {:class "f6 ttu tracked gray"}
    author]])


(defn section-post [post]
  [:section {:class "mw6 center avenir ph3 ph0-l black-80"}

   [article-title (:title post) (:author post)]
   
   [:div
    [quote
     "Lasst den Geist eures Denkens erneuern und zieht euer neues Ich an."
     "Epheser 4:23"]
    
    [paragraph
     "Neuroplastizität (die Fähigkeit des Gehirns, sich als Reaktion
     auf das Denken zu verändern) kann sowohl für uns als auch gegen
     uns arbeiten, denn das, worüber wir am meisten nachdenken, wird
     wachsen – das gilt sowohl für das Positive als auch für das
     Negative."]

    [paragraph "Datum:"]

    [paragraph {:class "b"}
     "Atme 5 Mal tief ein und aus!"]

    [quote2
     [:<>
      "Ich schöpfe meine Welt heute…" [:br]
      "Ich bin wundervoll, ich bin geliebt!"]]

    [paragraph {:class "underline b"}
     "Drei Dinge, für die ich heute dankbar bin:"]
    [paragraph {:style {:border-bottom "1px dotted"}} "1."]
    [paragraph {:style {:border-bottom "1px dotted"}} "2."]
    [paragraph {:style {:border-bottom "1px dotted"}} "3."]


    [:h2 {:class "pt4"} "Morgenreflektion"]

    [paragraph
     [:<>
      [:strong "Sei liebevoll zu Dir selbst:"] [:br]
      [:strong "in Gedanken, zu Deinem Körper und Deiner Seele."] [:br]
      "Wie kann ich heute Liebe gegenüber mir selbst zeigen:"]]

    [paragraph {:style {:border-bottom "1px dotted"}} [:br]]
    [paragraph {:style {:border-bottom "1px dotted"}} [:br]]
    [paragraph {:style {:border-bottom "1px dotted"}} [:br]]
    [paragraph {:style {:border-bottom "1px dotted"}} [:br]]

    ]])




(defn index []
  [:<>
   [:header {:class "pv2 tc serif"}
    [logo]
    [nav]]
   #_[section-posts-summary (get-posts)]
   [section-post (first (get-posts))]
   [footer]])
