ALTER TABLE public.consortium_user DROP CONSTRAINT person_fk;
ALTER TABLE public.consortium_user ADD CONSTRAINT person_fk FOREIGN KEY (person_id) REFERENCES public.person(id) ON DELETE CASCADE;
