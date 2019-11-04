CREATE TABLE public.cidade (
    id integer NOT NULL,
    nome character varying(255),
    uf_id smallint
);


ALTER TABLE public.cidade OWNER TO sfp;

--
-- Name: cidade_id_seq; Type: SEQUENCE; Schema: public; Owner: sfp
--

CREATE SEQUENCE public.cidade_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cidade_id_seq OWNER TO sfp;

--
-- Name: cidade_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: sfp
--

ALTER SEQUENCE public.cidade_id_seq OWNED BY public.cidade.id;


--
-- Name: pais; Type: TABLE; Schema: public; Owner: sfp
--

CREATE TABLE public.pais (
    id integer NOT NULL,
    nascionalidade character varying(255),
    nome character varying(255)
);


ALTER TABLE public.pais OWNER TO sfp;

--
-- Name: pais_id_seq; Type: SEQUENCE; Schema: public; Owner: sfp
--

CREATE SEQUENCE public.pais_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.pais_id_seq OWNER TO sfp;

--
-- Name: pais_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: sfp
--

ALTER SEQUENCE public.pais_id_seq OWNED BY public.pais.id;


--
-- Name: pessoa; Type: TABLE; Schema: public; Owner: sfp
--

CREATE TABLE public.pessoa (
    id bigint NOT NULL,
    cpf character varying(255) NOT NULL,
    dth_cadastro timestamp without time zone NOT NULL,
    email character varying(255),
    nascimento date NOT NULL,
    nome character varying(255) NOT NULL,
    sexo integer,
    naturalidade_id integer
);


ALTER TABLE public.pessoa OWNER TO sfp;

--
-- Name: pessoa_id_seq; Type: SEQUENCE; Schema: public; Owner: sfp
--

CREATE SEQUENCE public.pessoa_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.pessoa_id_seq OWNER TO sfp;

--
-- Name: pessoa_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: sfp
--

ALTER SEQUENCE public.pessoa_id_seq OWNED BY public.pessoa.id;


--
-- Name: pessoa_nascionalidade; Type: TABLE; Schema: public; Owner: sfp
--

CREATE TABLE public.pessoa_nascionalidade (
    pessoa_id bigint NOT NULL,
    pais_id smallint NOT NULL
);


ALTER TABLE public.pessoa_nascionalidade OWNER TO sfp;

--
-- Name: uf; Type: TABLE; Schema: public; Owner: sfp
--

CREATE TABLE public.uf (
    id integer NOT NULL,
    nome character varying(255),
    sigla character varying(255),
    pais_id smallint
);


ALTER TABLE public.uf OWNER TO sfp;

--
-- Name: uf_id_seq; Type: SEQUENCE; Schema: public; Owner: sfp
--

CREATE SEQUENCE public.uf_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.uf_id_seq OWNER TO sfp;

--
-- Name: uf_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: sfp
--

ALTER SEQUENCE public.uf_id_seq OWNED BY public.uf.id;


--
-- Name: cidade id; Type: DEFAULT; Schema: public; Owner: sfp
--

ALTER TABLE ONLY public.cidade ALTER COLUMN id SET DEFAULT nextval('public.cidade_id_seq'::regclass);


--
-- Name: pais id; Type: DEFAULT; Schema: public; Owner: sfp
--

ALTER TABLE ONLY public.pais ALTER COLUMN id SET DEFAULT nextval('public.pais_id_seq'::regclass);


--
-- Name: pessoa id; Type: DEFAULT; Schema: public; Owner: sfp
--

ALTER TABLE ONLY public.pessoa ALTER COLUMN id SET DEFAULT nextval('public.pessoa_id_seq'::regclass);


--
-- Name: uf id; Type: DEFAULT; Schema: public; Owner: sfp
--

ALTER TABLE ONLY public.uf ALTER COLUMN id SET DEFAULT nextval('public.uf_id_seq'::regclass);


--
-- Data for Name: cidade; Type: TABLE DATA; Schema: public; Owner: sfp
--

COPY public.cidade (id, nome, uf_id) FROM stdin;
\.


--
-- Data for Name: pais; Type: TABLE DATA; Schema: public; Owner: sfp
--

COPY public.pais (id, nascionalidade, nome) FROM stdin;
\.


--
-- Data for Name: pessoa; Type: TABLE DATA; Schema: public; Owner: sfp
--

COPY public.pessoa (id, cpf, dth_cadastro, email, nascimento, nome, sexo, naturalidade_id) FROM stdin;
\.


--
-- Data for Name: pessoa_nascionalidade; Type: TABLE DATA; Schema: public; Owner: sfp
--

COPY public.pessoa_nascionalidade (pessoa_id, pais_id) FROM stdin;
\.


--
-- Data for Name: uf; Type: TABLE DATA; Schema: public; Owner: sfp
--

COPY public.uf (id, nome, sigla, pais_id) FROM stdin;
\.


--
-- Name: cidade_id_seq; Type: SEQUENCE SET; Schema: public; Owner: sfp
--

SELECT pg_catalog.setval('public.cidade_id_seq', 1, false);


--
-- Name: pais_id_seq; Type: SEQUENCE SET; Schema: public; Owner: sfp
--

SELECT pg_catalog.setval('public.pais_id_seq', 1, false);


--
-- Name: pessoa_id_seq; Type: SEQUENCE SET; Schema: public; Owner: sfp
--

SELECT pg_catalog.setval('public.pessoa_id_seq', 1, false);


--
-- Name: uf_id_seq; Type: SEQUENCE SET; Schema: public; Owner: sfp
--

SELECT pg_catalog.setval('public.uf_id_seq', 1, false);


--
-- Name: cidade cidade_pkey; Type: CONSTRAINT; Schema: public; Owner: sfp
--

ALTER TABLE ONLY public.cidade
    ADD CONSTRAINT cidade_pkey PRIMARY KEY (id);


--
-- Name: pais pais_pkey; Type: CONSTRAINT; Schema: public; Owner: sfp
--

ALTER TABLE ONLY public.pais
    ADD CONSTRAINT pais_pkey PRIMARY KEY (id);


--
-- Name: pessoa pessoa_pkey; Type: CONSTRAINT; Schema: public; Owner: sfp
--

ALTER TABLE ONLY public.pessoa
    ADD CONSTRAINT pessoa_pkey PRIMARY KEY (id);


--
-- Name: uf uf_pkey; Type: CONSTRAINT; Schema: public; Owner: sfp
--

ALTER TABLE ONLY public.uf
    ADD CONSTRAINT uf_pkey PRIMARY KEY (id);


--
-- Name: pessoa uk_nlwiu48rutiltbnjle59krljo; Type: CONSTRAINT; Schema: public; Owner: sfp
--

ALTER TABLE ONLY public.pessoa
    ADD CONSTRAINT uk_nlwiu48rutiltbnjle59krljo UNIQUE (cpf);


--
-- Name: pessoa_nascionalidade fk7e382sbqdo58f6i2wnucyb1xr; Type: FK CONSTRAINT; Schema: public; Owner: sfp
--

ALTER TABLE ONLY public.pessoa_nascionalidade
    ADD CONSTRAINT fk7e382sbqdo58f6i2wnucyb1xr FOREIGN KEY (pessoa_id) REFERENCES public.pessoa(id);


--
-- Name: uf fk9afakn5g7eta3m6judua18g5v; Type: FK CONSTRAINT; Schema: public; Owner: sfp
--

ALTER TABLE ONLY public.uf
    ADD CONSTRAINT fk9afakn5g7eta3m6judua18g5v FOREIGN KEY (pais_id) REFERENCES public.pais(id);


--
-- Name: pessoa_nascionalidade fkg49e23y6jgb1aw5oyximbj3yq; Type: FK CONSTRAINT; Schema: public; Owner: sfp
--

ALTER TABLE ONLY public.pessoa_nascionalidade
    ADD CONSTRAINT fkg49e23y6jgb1aw5oyximbj3yq FOREIGN KEY (pais_id) REFERENCES public.pais(id);


--
-- Name: pessoa fki6731f0lh9gthjplhdtplgfjv; Type: FK CONSTRAINT; Schema: public; Owner: sfp
--

ALTER TABLE ONLY public.pessoa
    ADD CONSTRAINT fki6731f0lh9gthjplhdtplgfjv FOREIGN KEY (naturalidade_id) REFERENCES public.cidade(id);


--
-- Name: cidade fkmmhbkvcabtujkj1t29lq47oq0; Type: FK CONSTRAINT; Schema: public; Owner: sfp
--

ALTER TABLE ONLY public.cidade
    ADD CONSTRAINT fkmmhbkvcabtujkj1t29lq47oq0 FOREIGN KEY (uf_id) REFERENCES public.uf(id);


--
-- PostgreSQL database dump complete
--
