FROM jetbrains/teamcity-agent

# Set LEIN_ROOT to disable warning if run as root
ENV LEIN_ROOT 1

# Install Leiningen stable and bash as dependency.
RUN curl -L "https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein" -o /usr/local/bin/lein
RUN chmod 0744 /usr/local/bin/lein
RUN lein upgrade
