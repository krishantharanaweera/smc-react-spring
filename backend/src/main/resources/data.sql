INSERT INTO users (id, name, email, role, provider, provider_id, created_at)
VALUES
  (1, 'Admin User',    'admin@campus.edu',   'ADMIN',   'local',  'local-1', CURRENT_TIMESTAMP),
  (2, 'Alice Johnson', 'alice@campus.edu',   'STUDENT', 'google', 'g-001',   CURRENT_TIMESTAMP),
  (3, 'Bob Smith',     'bob@campus.edu',     'STAFF',   'google', 'g-002',   CURRENT_TIMESTAMP),
  (4, 'Carol White',   'carol@campus.edu',   'STUDENT', 'google', 'g-003',   CURRENT_TIMESTAMP);


