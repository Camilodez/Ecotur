--
-- PostgreSQL database dump
--

-- Dumped from database version 16.2
-- Dumped by pg_dump version 16.2

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: insert_occurrence(integer, integer, character varying, character varying, character varying, character varying, character varying, character varying, character varying, character varying, integer, character varying, character varying, character varying, character varying, character varying, date, character varying, character varying, character varying, character varying, character varying, integer, numeric, numeric, character varying); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION public.insert_occurrence(p_user_id integer, p_scientificnameid integer, p_basisofrecord character varying, p_type character varying, p_institutioncode character varying, p_institutionid character varying, p_collectioncode character varying, p_collectionid character varying, p_catalognumber character varying, p_recordedby character varying, p_organismquantity integer, p_organismquantitytype character varying, p_occurrencestatus character varying, p_preparations character varying, p_disposition character varying, p_eventid character varying, p_eventdate date, p_country character varying, p_stateprovince character varying, p_county character varying, p_municipality character varying, p_locality character varying, p_minimumelevationinmeters integer, p_decimallatitude numeric, p_decimallongitude numeric, p_geodeticdatum character varying) RETURNS void
    LANGUAGE plpgsql
    AS $$
BEGIN
    INSERT INTO occurrences (
        user_id,
        scientificnameid,
        basisofrecord,
        type,
        institutioncode,
        institutionid,
        collectioncode,
        collectionid,
        catalognumber,
        recordedby,
        organismquantity,
        organismquantitytype,
        occurrencestatus,
        preparations,
        disposition,
        eventid,
        eventdate,
        country,
        stateprovince,
        county,
        municipality,
        locality,
        minimumelevationinmeters,
        decimallatitude,
        decimallongitude,
        geodeticdatum
    )
    VALUES (
        p_user_id,
        p_scientificnameid,
        p_basisofrecord,
        p_type,
        p_institutioncode,
        p_institutionid,
        p_collectioncode,
        p_collectionid,
        p_catalognumber,
        p_recordedby,
        p_organismquantity,
        p_organismquantitytype,
        p_occurrencestatus,
        p_preparations,
        p_disposition,
        p_eventid,
        p_eventdate,
        p_country,
        p_stateprovince,
        p_county,
        p_municipality,
        p_locality,
        p_minimumelevationinmeters,
        p_decimallatitude,
        p_decimallongitude,
        p_geodeticdatum
    );
END;
$$;


ALTER FUNCTION public.insert_occurrence(p_user_id integer, p_scientificnameid integer, p_basisofrecord character varying, p_type character varying, p_institutioncode character varying, p_institutionid character varying, p_collectioncode character varying, p_collectionid character varying, p_catalognumber character varying, p_recordedby character varying, p_organismquantity integer, p_organismquantitytype character varying, p_occurrencestatus character varying, p_preparations character varying, p_disposition character varying, p_eventid character varying, p_eventdate date, p_country character varying, p_stateprovince character varying, p_county character varying, p_municipality character varying, p_locality character varying, p_minimumelevationinmeters integer, p_decimallatitude numeric, p_decimallongitude numeric, p_geodeticdatum character varying) OWNER TO postgres;

--
-- Name: insert_organism(character varying, character varying, character varying); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION public.insert_organism(p_organismname character varying, p_scientificname character varying, p_taxonrank character varying) RETURNS void
    LANGUAGE plpgsql
    AS $$
BEGIN
    -- Insert a new row into the organisms table
    INSERT INTO organisms (organismName, scientificName, taxonRank)
    VALUES (p_organismName, p_scientificName, p_taxonRank);
END;
$$;


ALTER FUNCTION public.insert_organism(p_organismname character varying, p_scientificname character varying, p_taxonrank character varying) OWNER TO postgres;

--
-- Name: insert_user(character varying, character varying, character varying); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION public.insert_user(p_username character varying, p_email character varying, p_password character varying) RETURNS void
    LANGUAGE plpgsql
    AS $$
BEGIN
    INSERT INTO users (username, email, password)
    VALUES (p_username, p_email, p_password);
END;
$$;


ALTER FUNCTION public.insert_user(p_username character varying, p_email character varying, p_password character varying) OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: occurrences; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.occurrences (
    occurrenceid integer NOT NULL,
    user_id integer,
    scientificnameid integer,
    basisofrecord character varying(50) NOT NULL,
    type character varying(50),
    institutioncode character varying(50),
    institutionid character varying(50),
    collectioncode character varying(50),
    collectionid character varying(50),
    catalognumber character varying(50),
    recordedby character varying(100),
    organismquantity integer,
    organismquantitytype character varying(50),
    occurrencestatus character varying(50),
    preparations character varying(100),
    disposition character varying(100),
    eventid character varying(50),
    eventdate date,
    country character varying(100),
    stateprovince character varying(100),
    county character varying(100),
    municipality character varying(100),
    locality character varying(100),
    minimumelevationinmeters integer,
    decimallatitude numeric(10,8),
    decimallongitude numeric(11,8),
    geodeticdatum character varying(50)
);


ALTER TABLE public.occurrences OWNER TO postgres;

--
-- Name: occurrences_occurrenceid_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.occurrences_occurrenceid_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.occurrences_occurrenceid_seq OWNER TO postgres;

--
-- Name: occurrences_occurrenceid_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.occurrences_occurrenceid_seq OWNED BY public.occurrences.occurrenceid;


--
-- Name: organisms; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.organisms (
    scientificnameid integer NOT NULL,
    organismname character varying(100) NOT NULL,
    scientificname character varying(100) NOT NULL,
    taxonrank character varying(50) NOT NULL
);


ALTER TABLE public.organisms OWNER TO postgres;

--
-- Name: organisms_scientificnameid_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.organisms_scientificnameid_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.organisms_scientificnameid_seq OWNER TO postgres;

--
-- Name: organisms_scientificnameid_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.organisms_scientificnameid_seq OWNED BY public.organisms.scientificnameid;


--
-- Name: users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.users (
    user_id integer NOT NULL,
    username character varying(50) NOT NULL,
    email character varying(100) NOT NULL,
    password character varying(100) NOT NULL
);


ALTER TABLE public.users OWNER TO postgres;

--
-- Name: users_user_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.users_user_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.users_user_id_seq OWNER TO postgres;

--
-- Name: users_user_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.users_user_id_seq OWNED BY public.users.user_id;


--
-- Name: occurrences occurrenceid; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.occurrences ALTER COLUMN occurrenceid SET DEFAULT nextval('public.occurrences_occurrenceid_seq'::regclass);


--
-- Name: organisms scientificnameid; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.organisms ALTER COLUMN scientificnameid SET DEFAULT nextval('public.organisms_scientificnameid_seq'::regclass);


--
-- Name: users user_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users ALTER COLUMN user_id SET DEFAULT nextval('public.users_user_id_seq'::regclass);


--
-- Data for Name: occurrences; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.occurrences (occurrenceid, user_id, scientificnameid, basisofrecord, type, institutioncode, institutionid, collectioncode, collectionid, catalognumber, recordedby, organismquantity, organismquantitytype, occurrencestatus, preparations, disposition, eventid, eventdate, country, stateprovince, county, municipality, locality, minimumelevationinmeters, decimallatitude, decimallongitude, geodeticdatum) FROM stdin;
\.


--
-- Data for Name: organisms; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.organisms (scientificnameid, organismname, scientificname, taxonrank) FROM stdin;
\.


--
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.users (user_id, username, email, password) FROM stdin;
\.


--
-- Name: occurrences_occurrenceid_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.occurrences_occurrenceid_seq', 1, false);


--
-- Name: organisms_scientificnameid_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.organisms_scientificnameid_seq', 3, true);


--
-- Name: users_user_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.users_user_id_seq', 1, false);


--
-- Name: occurrences occurrences_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.occurrences
    ADD CONSTRAINT occurrences_pkey PRIMARY KEY (occurrenceid);


--
-- Name: organisms organisms_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.organisms
    ADD CONSTRAINT organisms_pkey PRIMARY KEY (scientificnameid);


--
-- Name: users users_email_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_email_key UNIQUE (email);


--
-- Name: users users_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (user_id);


--
-- Name: users users_username_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_username_key UNIQUE (username);


--
-- Name: occurrences occurrences_scientificnameid_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.occurrences
    ADD CONSTRAINT occurrences_scientificnameid_fkey FOREIGN KEY (scientificnameid) REFERENCES public.organisms(scientificnameid);


--
-- Name: occurrences occurrences_user_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.occurrences
    ADD CONSTRAINT occurrences_user_id_fkey FOREIGN KEY (user_id) REFERENCES public.users(user_id);


--
-- PostgreSQL database dump complete
--

