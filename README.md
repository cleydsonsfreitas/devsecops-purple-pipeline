# Engenharia DevSecOps: Operacionalizando Estratégias Purple Team em Pipelines CI/CD

Este repositório contém o modelo experimental de uma pipeline de segurança automatizada, desenvolvida como parte integrante do artigo acadêmico para o curso de Tecnologia em Segurança da Informação da **FATEC Araraquara**.

##  Objetivo
Demonstrar a integração prática entre segurança ofensiva (Red Team) e defensiva (Blue Team) em um ambiente de desenvolvimento Java, utilizando automação para garantir conformidade contínua (GRC).

##  Stack Técnica
* **Linguagem:** Java 17+ (Spring Boot)
* **Contêiner:** Docker
* **Pipeline:** GitHub Actions
* **Segurança Ofensiva:** OWASP ZAP (API Mode) & SQLmap
* **Segurança Defensiva:** JSON Structured Logging & SIEM Integration

##  Estrutura da Metodologia
A pipeline está configurada para executar as seguintes etapas:
1. **SCA & SAST:** Análise de vulnerabilidades em dependências e código-fonte.
2. **DAST (OWASP ZAP):** Varredura dinâmica em tempo de execução buscando falhas do OWASP Top 10.
3. **Ofensiva Crítica (SQLmap):** Testes de estresse contra injeção de SQL em endpoints de persistência.
4. **Security Gates:** Bloqueio automático do build em caso de vulnerabilidades críticas ou altas.

##  Governança e Compliance (GRC)
O projeto implementa o conceito de "Conformidade como Código", assegurando que os controles da **ISO 27001** sejam validados automaticamente a cada commit, gerando evidências auditáveis em tempo real.

---
**Autor:** Cleydson Soares de Freitas
**Área:** DevSecOps | GRC | Full Stack Java
[LinkedIn](https://www.linkedin.com/in/cleydsonfreitas/)# devsecops-purple-pipeline
