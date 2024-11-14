User
- id: long
- username: string
- email: string

Company
- id: long
- name: string
- industry: string
- website: string

Location
- id: long
- city: string
- country: string

CompanyLocation
- company_id: long
- location_id: long

Review
- id: long
- userId: long
- companyId: long
- rating: int
- pay: double
- content: string
- createdAt: datetime
- updatedAt: datetime

UserAuth
- userId: long
- passwordHash: string

